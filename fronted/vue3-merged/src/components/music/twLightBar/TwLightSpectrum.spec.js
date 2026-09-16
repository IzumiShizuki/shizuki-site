import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const spectrumSource = readFileSync(
  resolve(process.cwd(), 'src/components/music/twLightBar/TwLightSpectrum.vue'),
  'utf8'
);
const appSource = readFileSync(resolve(process.cwd(), 'src/App.vue'), 'utf8');

describe('TwLightSpectrum live audio source', () => {
  it('requests a real analyser bus before rendering a playing spectrum', () => {
    expect(spectrumSource).toContain('analyserBus?.ensure?.()');
    expect(appSource).toContain("provide(AUDIO_ANALYSER_BUS_KEY");
    expect(appSource).toContain('getAnalyser: () => analyser');
  });

  it('does not animate a fake fallback while audio data is unavailable', () => {
    expect(spectrumSource).not.toContain('tw-spectrum-idle');
    expect(spectrumSource).not.toContain('is-idle-fallback');
  });
});
