
class Lighting {
    constructor() {
      this.lights = {};
    }
  
    turnOn(lightId) {
      this.lights[lightId] = true;
      console.log(`Light ${lightId} is turned on.`);
    }
  
    turnOff(lightId) {
      this.lights[lightId] = false;
      console.log(`Light ${lightId} is turned off.`);
    }
  
    getStatus(lightId) {
      return this.lights[lightId] ? 'On' : 'Off';
    }
  }
  
  module.exports = new Lighting();
  