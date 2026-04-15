package t2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20317a;

    public /* synthetic */ f(int i10) {
        this.f20317a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20317a) {
        }
        return ud.b.j(Integer.valueOf(((e) obj).f20310b), Integer.valueOf(((e) obj2).f20310b));
    }
}
