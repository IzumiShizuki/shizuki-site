package zd;

import ce.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum g implements q {
    f26776b("NONE"),
    f26777c("INTERNAL_TO_CLASS_ID"),
    f26778d("DESC_TO_CLASS_ID");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26780a;

    g(String str) {
        this.f26780a = i;
    }

    @Override // ce.q
    public final int a() {
        return this.f26780a;
    }
}
