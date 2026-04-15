package c4;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3389a;

    public /* synthetic */ o(int i10) {
        this.f3389a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3389a) {
            case 0:
                try {
                    int i10 = r3.a.f18745a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.d()) {
                        k.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = r3.a.f18745a;
                    Trace.endSection();
                    throw th2;
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
