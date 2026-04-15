package p4;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements x8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16572a;

    public /* synthetic */ f(boolean z10) {
        this.f16572a = z10;
    }

    @Override // x8.f
    public boolean a(t8.h hVar) {
        return this.f16572a;
    }

    @Override // x8.f
    public boolean b() {
        return this.f16572a;
    }

    public synchronized void c() {
        while (!this.f16572a) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z10 = false;
        while (!this.f16572a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean e() {
        return this.f16572a;
    }

    public synchronized boolean f() {
        if (this.f16572a) {
            return false;
        }
        this.f16572a = true;
        notifyAll();
        return true;
    }

    public f(Context context, Looper looper, v vVar, int i10) {
        switch (i10) {
            case 3:
                new r5.p(context.getApplicationContext(), 7);
                vVar.a(looper, null);
                break;
            default:
                new r5.p(context.getApplicationContext(), 6);
                vVar.a(looper, null);
                break;
        }
    }
}
