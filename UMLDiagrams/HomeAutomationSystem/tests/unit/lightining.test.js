// tests/unit/lighting.test.js
const lightingService = require('../../src/services/lightingService');

test('turn on light', () => {
  lightingService.turnOn('livingRoom');
  expect(lightingService.getStatus('livingRoom')).toBe('On');
});
