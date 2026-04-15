package g6;

import java.util.ArrayList;
import m4.k0;
import m4.m0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7439a;

    public c(ArrayList arrayList) {
        this.f7439a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((b) arrayList.get(0)).f7437b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i10)).f7436a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((b) arrayList.get(i10)).f7437b;
                    i10++;
                }
            }
        }
        p4.c.c(!z10);
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f7439a.equals(((c) obj).f7439a);
    }

    public final int hashCode() {
        return this.f7439a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f7439a;
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
