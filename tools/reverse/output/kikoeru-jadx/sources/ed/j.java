package ed;

import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f6503i = new j(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // ic.k
    public final Object a(Object obj) {
        Member member = (Member) obj;
        jc.l.e(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
