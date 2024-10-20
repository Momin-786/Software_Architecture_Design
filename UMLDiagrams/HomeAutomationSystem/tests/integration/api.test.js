// tests/integration/api.test.js
const request = require('supertest');
const app = require('../../src/utils/api'); // Assuming this exports the app

describe('API Integration Tests', () => {
  it('should turn on the light', async () => {
    const response = await request(app)
      .post('/api/lights/turn-on')
      .send({ lightId: 'livingRoom' });
    expect(response.text).toBe('Light turned on');
  });
});
