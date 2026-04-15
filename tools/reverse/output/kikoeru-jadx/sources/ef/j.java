package ef;

import java.util.List;
import java.util.regex.Matcher;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1.l f6573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f6574d;

    public j(Matcher matcher, CharSequence charSequence) {
        jc.l.e(charSequence, "input");
        this.f6571a = matcher;
        this.f6572b = charSequence;
        this.f6573c = new c1.l(1, this);
    }

    public final List a() {
        if (this.f6574d == null) {
            this.f6574d = new i(this);
        }
        i iVar = this.f6574d;
        jc.l.b(iVar);
        return iVar;
    }

    public final oc.d b() {
        Matcher matcher = this.f6571a;
        return nh.b.E(matcher.start(), matcher.end());
    }

    public final j c() {
        Matcher matcher = this.f6571a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f6572b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        jc.l.d(matcher2, "matcher(...)");
        return f0.e(matcher2, iEnd, charSequence);
    }
}
