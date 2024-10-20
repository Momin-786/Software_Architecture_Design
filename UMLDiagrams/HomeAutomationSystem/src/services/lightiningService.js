const Lighting = require('../components/Lighting');

class LightingService {
  turnOn(lightId) {
    Lighting.turnOn(lightId);
  }

  turnOff(lightId) {
    Lighting.turnOff(lightId);
  }

  getStatus(lightId) {
    return Lighting.getStatus(lightId);
  }
}

module.exports = new LightingService();
