package c4;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3360b;

    public /* synthetic */ a(int i10, String str) {
        this.f3359a = i10;
        this.f3360b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3359a) {
            case 0:
                Thread thread = new Thread(runnable, this.f3360b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f3360b);
        }
    }
}
