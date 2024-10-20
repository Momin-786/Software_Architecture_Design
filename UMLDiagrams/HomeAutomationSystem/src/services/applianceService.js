const Appliances = require('../components/Appliances');

class ApplianceService {
  turnOn(applianceId) {
    Appliances.turnOn(applianceId);
  }

  turnOff(applianceId) {
    Appliances.turnOff(applianceId);
  }

  getStatus(applianceId) {
    return Appliances.getStatus(applianceId);
  }
}

module.exports = new ApplianceService();
