
class Thermostat {
    constructor() {
      this.temperature = 22; // Default temperature
    }
  
    setTemperature(temp) {
      this.temperature = temp;
      console.log(`Temperature set to ${temp}°C`);
    }
  
    getTemperature() {
      return this.temperature;
    }
  }
  
  module.exports = new Thermostat();
  