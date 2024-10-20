const Security = require('../components/Security');

class SecurityService {
  activateAlarm() {
    Security.activateAlarm();
  }

  deactivateAlarm() {
    Security.deactivateAlarm();
  }

  getStatus() {
    return Security.getStatus();
  }
}

module.exports = new SecurityService();
