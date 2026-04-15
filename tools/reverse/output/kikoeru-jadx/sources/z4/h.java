package z4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f26423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f26424d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f26421a = str;
        this.f26422b = j10;
        this.f26423c = Collections.unmodifiableList(arrayList);
        this.f26424d = Collections.unmodifiableList(list);
    }
}
