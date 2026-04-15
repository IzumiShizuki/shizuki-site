package u4;

import android.media.MediaCodec;
import m0.w;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f21371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f21374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f21378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f21379j;

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21378i = cryptoInfo;
        this.f21379j = c0.f16548a >= 24 ? new w(cryptoInfo) : null;
    }
}
