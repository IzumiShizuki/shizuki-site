package z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f26381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f26383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f26384f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f26379a = j10;
        this.f26380b = i10;
        this.f26381c = Collections.unmodifiableList(arrayList);
        this.f26382d = Collections.unmodifiableList(list);
        this.f26383e = Collections.unmodifiableList(list2);
        this.f26384f = Collections.unmodifiableList(list3);
    }
}
