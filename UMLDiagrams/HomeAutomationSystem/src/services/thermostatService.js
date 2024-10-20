const Thermostat = require('../components/Thermostat');

class ThermostatService {
  setTemperature(temp) {
    Thermostat.setTemperature(temp);
  }

  getTemperature() {
    return Thermostat.getTemperature();
  }
}

module.exports = new ThermostatService();
