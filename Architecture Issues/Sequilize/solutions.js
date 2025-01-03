const { User, Post } = require('./models');

(async () => {
  try {
    // Optimized eager loading
    const users = await User.findAll({
      attributes: ['id', 'name'],
      include: {
        model: Post,
        attributes: ['id', 'title'],
      },
    });

    console.log('Optimized Query Result:');
    console.log(JSON.stringify(users, null, 2));

    // Lazy loading example
    const user = await User.findByPk(1); // Fetch a single user
    const posts = await user.getPosts({ attributes: ['id', 'title'] }); // Fetch only required posts

    console.log('Lazy Loaded Posts:');
    console.log(JSON.stringify(posts, null, 2));
  } catch (error) {
    console.error('Error:', error);
  }
})();
