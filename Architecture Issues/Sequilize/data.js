const { sequelize, User, Post } = require('./models');

(async () => {
  try {
    await sequelize.sync({ force: true }); // Recreate tables

    const user = await User.create({ name: 'Momin' });
    await Post.bulkCreate([
      { title: 'First Post', userId: user.id },
      { title: 'Second Post', userId: user.id },
    ]);

    console.log('Sample data added.');
  } catch (error) {
    console.error('Error while adding sample data:', error);
  }
})();
