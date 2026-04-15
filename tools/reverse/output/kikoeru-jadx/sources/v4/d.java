package v4;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa.i f22439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f22441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m4.d f22442d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22444f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n4.b f22446h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22445g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22443e = 0;

    public d(Context context, Handler handler, s sVar) {
        this.f22439a = ua.l.U(new b(context, 0));
        this.f22441c = sVar;
        this.f22440b = handler;
    }

    public final void a() {
        int i10 = this.f22443e;
        if (i10 == 1 || i10 == 0 || this.f22446h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f22439a.get();
        n4.b bVar = this.f22446h;
        if (p4.c0.f16548a < 26) {
            audioManager.abandonAudioFocus(bVar.f15257b);
            return;
        }
        Object obj = bVar.f15261f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(k1.g.i(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(m4.d r7) {
        /*
            r6 = this;
            m4.d r0 = r6.f22442d
            boolean r0 = ud.n.f(r0, r7)
            if (r0 != 0) goto L3b
            r6.f22442d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L10
        Le:
            r3 = 0
            goto L2f
        L10:
            int r2 = r7.f14166c
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L29;
                case 1: goto L27;
                case 2: goto L25;
                case 3: goto Le;
                case 4: goto L25;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L21;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L27;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r7 = "Unidentified audio usage: "
            q.t0.J(r2, r7, r5)
            goto Le
        L1f:
            r3 = 4
            goto L2f
        L21:
            int r7 = r7.f14164a
            if (r7 != r1) goto L2f
        L25:
            r3 = 2
            goto L2f
        L27:
            r3 = 1
            goto L2f
        L29:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            p4.c.B(r5, r7)
            goto L27
        L2f:
            r6.f22444f = r3
            if (r3 == r1) goto L35
            if (r3 != 0) goto L36
        L35:
            r0 = 1
        L36:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            p4.c.b(r7, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.b(m4.d):void");
    }

    public final void c(int i10) {
        if (this.f22443e == i10) {
            return;
        }
        this.f22443e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f22445g == f10) {
            return;
        }
        this.f22445g = f10;
        s sVar = this.f22441c;
        if (sVar != null) {
            v vVar = sVar.f22626a;
            vVar.a2(1, 2, Float.valueOf(vVar.U * vVar.f22700z.f22445g));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.d(int, boolean):int");
    }
}
