
# Sequelize Architectural Problem: Inefficient Query Generation

This project demonstrates the **Inefficient Query Generation** issue in Sequelize and provides an optimized solution. The problem occurs when Sequelize generates overly complex queries, fetching unnecessary data, which leads to performance bottlenecks.


---
## **Lectue Video**
https://github.com/user-attachments/assets/856c14ee-a9d9-424b-b929-8f4470023617

## Project Structure

```
project/
├── models/
│   └── index.js        # Sequelize models for User and Post
├── data.js             # Script to sync database and create sample data
├── problem.js          # Script replicating the inefficient query issue
├── solution.js         # Script demonstrating the optimized solution
└── package.json        # Node.js project configuration
```

---

## Requirements

- Node.js (>=14.x)
- MsSQL

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Momin-786/Software_Architecture_Design.git
   cd sequelize
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Configure your MySQL database in `models/index.js`:
   ```javascript
   const sequelize = new Sequelize('database', 'username', 'password', {
     host: 'localhost',
     dialect: 'mysql',
   });
   ```

---

## Usage

1. Sync the database and insert sample data:
   ```bash
   node data.js
   ```

2. Run the problem script to replicate the issue:
   ```bash
   node problem.js
   ```
   **Expected Result:** A large, complex SQL query fetching unnecessary data.

3. Run the solution script to see the optimized query:
   ```bash
   node solution.js
   ```
   **Expected Result:** Optimized query fetching only the required columns and using lazy loading.

---

## Key Concepts

- **Eager Loading Optimization:** Fetch only specific attributes to reduce memory usage.
- **Lazy Loading:** Fetch associated data on demand, avoiding unnecessary joins.

---

## Output Examples

### Problem Script Output

```json
[
  {
    "id": 1,
    "name": "Ali",
    "Posts": [
      { "id": 1, "title": "First Post", "userId": 1 },
      { "id": 2, "title": "Second Post", "userId": 1 }
    ]
  }
]
```

### Solution Script Output

#### Optimized Eager Loading
```json
[
  {
    "id": 1,
    "name": "Ali",
    "Posts": [
      { "id": 1, "title": "First Post" },
      { "id": 2, "title": "Second Post" }
    ]
  }
]
```

#### Lazy Loading
```json
[
  { "id": 1, "title": "First Post" },
  { "id": 2, "title": "Second Post" }
]
```

---

## References

1. [Sequelize Documentation](https://sequelize.org/docs/v6/)
2. [Node.js Documentation](https://nodejs.org/en/docs/)
3. [MySQL Documentation](https://dev.mysql.com/doc/)

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```
