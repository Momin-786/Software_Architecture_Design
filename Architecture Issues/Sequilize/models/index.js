const { Sequelize, DataTypes } = require('sequelize');

// Connection setup for MSSQL
const sequelize = new Sequelize('ExampleDB', 'mo', '1234567890', {
  host: 'localhost', // Update as per your MSSQL server details
  dialect: 'mssql',
  logging: console.log, // Optional: logs SQL queries in console
});

// Define User model
const User = sequelize.define('User', {
  name: { type: DataTypes.STRING, allowNull: false },
});

// Define Post model
const Post = sequelize.define('Post', {
  title: { type: DataTypes.STRING, allowNull: false },
});

// Associations
User.hasMany(Post, { foreignKey: 'userId' });
Post.belongsTo(User, { foreignKey: 'userId' });

module.exports = { sequelize, User, Post };
