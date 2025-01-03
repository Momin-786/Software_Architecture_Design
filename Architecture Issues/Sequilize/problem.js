const { User, Post } = require('./models');

(async () => {
  try {
    // Fetch users along with all associated posts
    const users = await User.findAll({ include: Post });

    console.log('Problematic Query Result:');
    console.log(JSON.stringify(users, null, 2));
  } catch (error) {
    console.error('Error:', error);
  }
})();
