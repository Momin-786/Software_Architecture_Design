class Security {
    constructor() {
      this.alarmActive = false;
    }
  
    activateAlarm() {
      this.alarmActive = true;
      console.log("Alarm activated.");
    }
  
    deactivateAlarm() {
      this.alarmActive = false;
      console.log("Alarm deactivated.");
    }
  
    getStatus() {
      return this.alarmActive ? 'Active' : 'Inactive';
    }
  }
  
  module.exports = new Security();
  