package p5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f16718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16719c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16722f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16725i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16720d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16721e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16723g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16724h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f16726j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p4.v f16727k = p4.v.f16624a;

    public r(Context context, i iVar) {
        this.f16717a = iVar;
        this.f16718b = new u(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, mh.f r36) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.r.a(long, long, long, long, boolean, mh.f):int");
    }

    public final boolean b(boolean z10) {
        if (z10 && this.f16720d == 3) {
            this.f16724h = -9223372036854775807L;
            return true;
        }
        if (this.f16724h == -9223372036854775807L) {
            return false;
        }
        this.f16727k.getClass();
        if (SystemClock.elapsedRealtime() < this.f16724h) {
            return true;
        }
        this.f16724h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z10) {
        this.f16725i = z10;
        this.f16727k.getClass();
        this.f16724h = SystemClock.elapsedRealtime() + 5000;
    }

    public final void d(int i10) {
        this.f16720d = Math.min(this.f16720d, i10);
    }

    public final void e() {
        this.f16719c = true;
        this.f16727k.getClass();
        this.f16722f = c0.N(SystemClock.elapsedRealtime());
        u uVar = this.f16718b;
        uVar.f16738d = true;
        uVar.f16747m = 0L;
        uVar.f16750p = -1L;
        uVar.f16748n = -1L;
        s sVar = uVar.f16736b;
        if (sVar != null) {
            DisplayManager displayManager = sVar.f16728a;
            t tVar = uVar.f16737c;
            tVar.getClass();
            tVar.f16732b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(sVar, c0.n(null));
            u.a(sVar.f16729b, displayManager.getDisplay(0));
        }
        uVar.d(false);
    }

    public final void f() {
        this.f16719c = false;
        this.f16724h = -9223372036854775807L;
        u uVar = this.f16718b;
        uVar.f16738d = false;
        s sVar = uVar.f16736b;
        if (sVar != null) {
            sVar.f16728a.unregisterDisplayListener(sVar);
            t tVar = uVar.f16737c;
            tVar.getClass();
            tVar.f16732b.sendEmptyMessage(3);
        }
        uVar.b();
    }

    public final void g(float f10) {
        p4.c.c(f10 > 0.0f);
        if (f10 == this.f16726j) {
            return;
        }
        this.f16726j = f10;
        u uVar = this.f16718b;
        uVar.f16743i = f10;
        uVar.f16747m = 0L;
        uVar.f16750p = -1L;
        uVar.f16748n = -1L;
        uVar.d(false);
    }
}
