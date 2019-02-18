import { hello } from './hello-world.js';

describe('Hello World', () => {
  test('says hello', () => {
    expect(hello()).toEqual('Hello, World!');
  });
});
