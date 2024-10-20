class Appliances {
    constructor() {
      this.appliances = {};
    }
  
    turnOn(applianceId) {
      this.appliances[applianceId] = true;
      console.log(`${applianceId} is turned on.`);
    }
  
    turnOff(applianceId) {
      this.appliances[applianceId] = false;
      console.log(`${applianceId} is turned off.`);
    }
  
    getStatus(applianceId) {
      return this.appliances[applianceId] ? 'On' : 'Off';
    }
  }
  
  module.exports = new Appliances();
  