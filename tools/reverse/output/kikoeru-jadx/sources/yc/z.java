package yc;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f26163b;

    public z(ArrayList arrayList) {
        this.f26162a = arrayList;
        this.f26163b = vb.w.A(arrayList);
    }

    @Override // yc.r0
    public final boolean a(be.e eVar) {
        return this.f26163b.containsKey(eVar);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f26162a + ')';
    }
}
