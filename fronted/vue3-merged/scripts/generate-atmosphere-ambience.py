#!/usr/bin/env python3
"""Procedurally synthesize six loopable stereo ambience wavs for the atmosphere panel.

Matches the style of the existing local generated ambience files (rain-hush etc.):
16-bit PCM stereo, seamless loop via tail->head crossfade, conservative levels.
"""
import numpy as np
import wave
from scipy import signal

SR = 44100
RNG = np.random.default_rng(20260726)


def bp(x, lo, hi, order=4):
    sos = signal.butter(order, [lo, hi], btype="bandpass", fs=SR, output="sos")
    return signal.sosfilt(sos, x)


def lp(x, hz, order=4):
    sos = signal.butter(order, hz, btype="lowpass", fs=SR, output="sos")
    return signal.sosfilt(sos, x)


def hp(x, hz, order=4):
    sos = signal.butter(order, hz, btype="highpass", fs=SR, output="sos")
    return signal.sosfilt(sos, x)


def slow_noise(n, hz, seed_scale=1.0):
    """Smooth low-frequency modulation curve in [0,1]."""
    raw = RNG.standard_normal(n) * seed_scale
    sm = lp(raw, hz, order=2)
    sm -= sm.min()
    rng = sm.max() - sm.min()
    if rng > 1e-9:
        sm /= rng
    return sm


def loopify(stereo, fade_s=1.8):
    """Crossfade tail into head so audio.loop=true is seamless."""
    f = int(fade_s * SR)
    n = stereo.shape[0]
    body = stereo[: n - f].copy()
    tail = stereo[n - f :]
    ramp = np.linspace(0.0, 1.0, f)[:, None]
    body[:f] = body[:f] * ramp + tail * (1.0 - ramp)
    return body


def norm(stereo, peak=0.42):
    m = np.max(np.abs(stereo))
    if m > 1e-9:
        stereo = stereo * (peak / m)
    return stereo


def write_wav(path, stereo):
    data = np.clip(stereo, -1, 1)
    pcm = (data * 32767).astype("<i2")
    with wave.open(path, "wb") as w:
        w.setnchannels(2)
        w.setsampwidth(2)
        w.setframerate(SR)
        w.writeframes(pcm.tobytes())
    print(f"{path}: {stereo.shape[0]/SR:.1f}s peak={np.max(np.abs(stereo)):.3f}")


def st(l, r):
    return np.stack([l, r], axis=1)


def env_exp(n, decay_s):
    t = np.arange(n) / SR
    return np.exp(-t / decay_s)


def place(dst, src, at):
    i = int(at * SR)
    j = min(dst.shape[0], i + src.shape[0])
    if i < 0 or i >= dst.shape[0]:
        return
    dst[i:j] += src[: j - i]


# ---------------------------------------------------------------- thunder rain
def gen_thunder_rain(dur=28.0):
    n = int(dur * SR)
    # steady rain bed: two decorrelated noise layers + shared body
    shared = bp(RNG.standard_normal(n), 500, 7800)
    left = 0.62 * shared + 0.5 * bp(RNG.standard_normal(n), 400, 8600)
    right = 0.62 * shared + 0.5 * bp(RNG.standard_normal(n), 400, 8600)
    swell = 0.82 + 0.18 * slow_noise(n, 0.5)
    left *= swell
    right *= swell
    # droplet sparkle
    spark = hp(RNG.standard_normal(n), 5200) * (slow_noise(n, 6.0) ** 3) * 0.8
    left += spark * 0.5
    right += np.roll(spark, 977) * 0.5
    l, r = left * 0.32, right * 0.32

    # distant rolling thunder
    for t0, pan, decay, gain in ((4.6, 0.35, 4.4, 1.0), (13.8, 0.72, 5.6, 0.85), (21.9, 0.5, 3.6, 0.7)):
        m = int((decay * 2.2) * SR)
        rumble = lp(RNG.standard_normal(m), 130, order=6)
        roll = 0.55 + 0.45 * slow_noise(m, 1.6)
        e = env_exp(m, decay) * np.minimum(1.0, np.arange(m) / (0.28 * SR))
        burst = rumble * roll * e * 1.9 * gain
        lg, rg = np.sqrt(1 - pan), np.sqrt(pan)
        tmpL = np.zeros(n)
        tmpR = np.zeros(n)
        place(tmpL, burst * lg, t0)
        place(tmpR, burst * rg, t0 + 0.012)
        l += tmpL
        r += tmpR
    return norm(loopify(st(l, r)), 0.5)


# -------------------------------------------------------------------- campfire
def gen_campfire(dur=22.0):
    n = int(dur * SR)
    roar = lp(RNG.standard_normal(n), 320, order=4) * (0.6 + 0.4 * slow_noise(n, 0.7))
    hiss = bp(RNG.standard_normal(n), 900, 4200) * (0.25 + 0.5 * slow_noise(n, 1.8) ** 2)
    l = roar * 0.95 + hiss * 0.3
    r = np.roll(roar, 1543) * 0.95 + np.roll(hiss, 887) * 0.3

    # crackles
    n_crackle = 130
    times = np.sort(RNG.uniform(0, dur, n_crackle))
    for t0 in times:
        m = int(RNG.uniform(0.004, 0.03) * SR)
        c = hp(RNG.standard_normal(m), RNG.uniform(1800, 5200)) * env_exp(m, RNG.uniform(0.003, 0.012))
        g = RNG.uniform(0.25, 0.72)
        pan = RNG.uniform(0.25, 0.75)
        tl = np.zeros(n); tr = np.zeros(n)
        place(tl, c * g * np.sqrt(1 - pan), t0)
        place(tr, c * g * np.sqrt(pan), t0)
        l += tl; r += tr
    # occasional pops (low thump + snap)
    for t0 in np.sort(RNG.uniform(0, dur, 9)):
        m = int(0.09 * SR)
        thump = lp(RNG.standard_normal(m), 210, order=4) * env_exp(m, 0.03) * 1.1
        snap = hp(RNG.standard_normal(int(0.015 * SR)), 2600) * env_exp(int(0.015 * SR), 0.005) * 0.9
        pan = RNG.uniform(0.3, 0.7)
        tl = np.zeros(n); tr = np.zeros(n)
        place(tl, thump * np.sqrt(1 - pan), t0); place(tl, snap * np.sqrt(1 - pan), t0)
        place(tr, thump * np.sqrt(pan), t0 + 0.003); place(tr, snap * np.sqrt(pan), t0 + 0.003)
        l += tl; r += tr
    return norm(loopify(st(l, r)), 0.46)


# ----------------------------------------------------------------------- creek
def gen_creek(dur=22.0):
    n = int(dur * SR)
    ripple_l = (0.35 + 0.65 * slow_noise(n, 9.0) ** 1.6)
    ripple_r = (0.35 + 0.65 * slow_noise(n, 9.0) ** 1.6)
    water_l = bp(RNG.standard_normal(n), 600, 6800) * ripple_l
    water_r = bp(RNG.standard_normal(n), 600, 6800) * ripple_r
    flow = lp(RNG.standard_normal(n), 240, order=4) * 0.5
    l = water_l * 0.34 + flow * 0.3
    r = water_r * 0.34 + np.roll(flow, 2211) * 0.3

    # gurgle chirps (descending little blips)
    for t0 in np.sort(RNG.uniform(0, dur, 46)):
        m = int(RNG.uniform(0.03, 0.09) * SR)
        t = np.arange(m) / SR
        f0 = RNG.uniform(500, 1400)
        f1 = f0 * RNG.uniform(0.4, 0.65)
        freq = np.linspace(f0, f1, m)
        ph = 2 * np.pi * np.cumsum(freq) / SR
        blip = np.sin(ph) * env_exp(m, m / SR / 3.2) * RNG.uniform(0.05, 0.16)
        pan = RNG.uniform(0.2, 0.8)
        tl = np.zeros(n); tr = np.zeros(n)
        place(tl, blip * np.sqrt(1 - pan), t0)
        place(tr, blip * np.sqrt(pan), t0)
        l += tl; r += tr
    return norm(loopify(st(l, r)), 0.44)


# ----------------------------------------------------------------------- birds
def chirp_syllable(f_base, sweep, dur_s, vib_hz=0.0, vib_amt=0.0):
    m = int(dur_s * SR)
    t = np.arange(m) / SR
    freq = f_base * (1 + sweep * (t / dur_s))
    if vib_hz > 0:
        freq = freq * (1 + vib_amt * np.sin(2 * np.pi * vib_hz * t))
    ph = 2 * np.pi * np.cumsum(freq) / SR
    attack = np.minimum(1.0, t / 0.006)
    return np.sin(ph) * attack * env_exp(m, dur_s / 2.6)


def gen_birds(dur=28.0):
    n = int(dur * SR)
    air = lp(RNG.standard_normal(n), 2400, order=2) * (0.5 + 0.5 * slow_noise(n, 0.4)) * 0.05
    leaves_bed = bp(RNG.standard_normal(n), 900, 3600) * (slow_noise(n, 0.8) ** 2) * 0.05
    l = air + leaves_bed
    r = np.roll(air, 3121) + np.roll(leaves_bed, 1411)

    phrase_starts = np.sort(RNG.uniform(0.5, dur - 1.5, 15))
    for t0 in phrase_starts:
        f_base = RNG.uniform(1900, 4600)
        pan = RNG.uniform(0.15, 0.85)
        n_syl = RNG.integers(2, 6)
        cursor = t0
        gain = RNG.uniform(0.10, 0.24)
        for _ in range(n_syl):
            sweep = RNG.uniform(-0.5, 0.8)
            dur_s = RNG.uniform(0.05, 0.16)
            vib = RNG.uniform(0, 1) < 0.4
            syl = chirp_syllable(
                f_base * RNG.uniform(0.92, 1.08), sweep, dur_s,
                vib_hz=RNG.uniform(18, 40) if vib else 0.0,
                vib_amt=0.06 if vib else 0.0,
            ) * gain
            tl = np.zeros(n); tr = np.zeros(n)
            place(tl, syl * np.sqrt(1 - pan), cursor)
            place(tr, syl * np.sqrt(pan), cursor)
            l += tl; r += tr
            cursor += dur_s + RNG.uniform(0.03, 0.14)
    return norm(loopify(st(l, r)), 0.4)


# -------------------------------------------------------------------- crickets
def cricket_voice(n, dur, carrier, trill_hz, chirp_len, gap_len, level, pan, start_offset):
    t = np.arange(n) / SR
    tone = np.sin(2 * np.pi * carrier * t) * (0.7 + 0.3 * np.sin(2 * np.pi * (carrier * 1.995) * t))
    pulses = (signal.square(2 * np.pi * trill_hz * t, duty=0.42) + 1) / 2
    pulses = lp(pulses, 320, order=2)  # soften pulse edges
    period = chirp_len + gap_len
    phase = ((t + start_offset) % period)
    gate = np.clip((chirp_len - phase) / 0.02, 0, 1) * np.clip(phase / 0.015, 0, 1)
    gate = np.clip(gate, 0, 1)
    voice = tone * pulses * gate * level
    voice = bp(voice, carrier * 0.6, min(carrier * 1.8, SR / 2 - 200), order=2)
    return voice * np.sqrt(1 - pan), voice * np.sqrt(pan)


def gen_crickets(dur=28.0):
    n = int(dur * SR)
    night = lp(RNG.standard_normal(n), 220, order=4) * 0.14 * (0.6 + 0.4 * slow_noise(n, 0.3))
    shimmer = hp(RNG.standard_normal(n), 7800) * 0.008
    l = night + shimmer
    r = np.roll(night, 2721) + np.roll(shimmer, 933)
    voices = (
        dict(carrier=4300, trill_hz=26, chirp_len=0.55, gap_len=0.75, level=0.06, pan=0.3, start_offset=0.0),
        dict(carrier=4700, trill_hz=31, chirp_len=0.4, gap_len=1.05, level=0.045, pan=0.7, start_offset=0.6),
        dict(carrier=3900, trill_hz=22, chirp_len=0.8, gap_len=1.3, level=0.035, pan=0.5, start_offset=1.15),
    )
    for v in voices:
        vl, vr = cricket_voice(n, dur, **v)
        l += vl
        r += vr
    return norm(loopify(st(l, r)), 0.36)


# ------------------------------------------------------------------------ cafe
def gen_cafe(dur=28.0):
    n = int(dur * SR)
    room = lp(RNG.standard_normal(n), 160, order=4) * 0.35
    l = room * 0.7
    r = np.roll(room, 1877) * 0.7
    # murmur voices: band-limited noise with syllabic AM
    for _ in range(7):
        syllab = slow_noise(n, RNG.uniform(2.6, 4.2)) ** 2.2
        sentence = (slow_noise(n, 0.35) > 0.45).astype(float)
        sentence = lp(sentence, 1.2, order=2)
        voice = bp(RNG.standard_normal(n), RNG.uniform(220, 340), RNG.uniform(1900, 3100), order=2)
        voice = voice * syllab * np.clip(sentence, 0, 1) * RNG.uniform(0.05, 0.1)
        pan = RNG.uniform(0.15, 0.85)
        l += voice * np.sqrt(1 - pan)
        r += voice * np.sqrt(pan)
    # cup clinks
    for t0 in np.sort(RNG.uniform(1.0, dur - 0.5, 8)):
        m = int(0.35 * SR)
        t = np.arange(m) / SR
        fs = RNG.uniform(2300, 3400)
        ping = sum(
            a * np.sin(2 * np.pi * fs * k * t) * np.exp(-t / d)
            for a, k, d in ((1.0, 1.0, 0.05), (0.55, 2.76, 0.03), (0.3, 5.4, 0.018))
        ) * RNG.uniform(0.02, 0.05)
        pan = RNG.uniform(0.2, 0.8)
        tl = np.zeros(n); tr = np.zeros(n)
        place(tl, ping * np.sqrt(1 - pan), t0)
        place(tr, ping * np.sqrt(pan), t0)
        l += tl; r += tr
    # dish clatter, very occasional
    for t0 in np.sort(RNG.uniform(2.0, dur - 1.0, 3)):
        m = int(0.12 * SR)
        cl = bp(RNG.standard_normal(m), 1400, 5200, order=2) * env_exp(m, 0.03) * 0.06
        pan = RNG.uniform(0.25, 0.75)
        tl = np.zeros(n); tr = np.zeros(n)
        place(tl, cl * np.sqrt(1 - pan), t0)
        place(tr, cl * np.sqrt(pan), t0 + 0.004)
        l += tl; r += tr
    return norm(loopify(st(l, r)), 0.4)


OUT = "public/ambient"
import os
os.makedirs(OUT, exist_ok=True)
write_wav(f"{OUT}/thunder-roll.wav", gen_thunder_rain())
write_wav(f"{OUT}/campfire-glow.wav", gen_campfire())
write_wav(f"{OUT}/creek-babble.wav", gen_creek())
write_wav(f"{OUT}/morning-birds.wav", gen_birds())
write_wav(f"{OUT}/night-crickets.wav", gen_crickets())
write_wav(f"{OUT}/cafe-murmur.wav", gen_cafe())
print("done")
