const express = require('express');
const bodyParser = require('body-parser');
const lightingRoutes = require('../routes/lightingRoutes');
const securityRoutes = require('../routes/securityRoutes');
const thermostatRoutes = require('../routes/thermostatRoutes');
const applianceRoutes = require('../routes/applianceRoutes');

const app = express();
app.use(bodyParser.json());

app.use('/api/lights', lightingRoutes);
app.use('/api/security', securityRoutes);
app.use('/api/thermostat', thermostatRoutes);
app.use('/api/appliances', applianceRoutes);

const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
