package i7;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7.n f9151a = new b7.n();

    public abstract Integer a(i2 i2Var);

    public final void b() {
        b7.n nVar = this.f9151a;
        ArrayList arrayList = (ArrayList) nVar.f1986d;
        boolean z10 = false;
        if (!nVar.f1984b) {
            ReentrantLock reentrantLock = (ReentrantLock) nVar.f1985c;
            try {
                reentrantLock.lock();
                if (!nVar.f1984b) {
                    z10 = true;
                    nVar.f1984b = true;
                    List<ic.a> listG0 = vb.m.G0(arrayList);
                    arrayList.clear();
                    reentrantLock.unlock();
                    for (ic.a aVar : listG0) {
                        jc.l.e(aVar, "it");
                        aVar.b();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        if (z10) {
            if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                String str = "Invalidated PagingSource " + this;
                jc.l.e(str, "message");
                Log.d("Paging", str, null);
            }
        }
    }

    public abstract Object c(c2 c2Var, ac.c cVar);

    public final void d(ic.a aVar) {
        boolean z10;
        b7.n nVar = this.f9151a;
        nVar.getClass();
        if (nVar.f1984b) {
            aVar.b();
            return;
        }
        ReentrantLock reentrantLock = (ReentrantLock) nVar.f1985c;
        try {
            reentrantLock.lock();
            if (nVar.f1984b) {
                z10 = true;
            } else {
                ((ArrayList) nVar.f1986d).add(aVar);
                z10 = false;
            }
            if (z10) {
                aVar.b();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
