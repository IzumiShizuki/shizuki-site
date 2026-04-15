package a9;

import b7.b1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import ug.d0;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ug.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f229b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f228a = i10;
        this.f229b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ug.d0 c(ah.h r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.h.c(ah.h):ug.d0");
    }

    public static int e(d0 d0Var, int i10) {
        String strA = d0Var.f21761f.a("Retry-After");
        if (strA == null) {
            strA = null;
        }
        if (strA == null) {
            return i10;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        jc.l.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strA).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strA);
        jc.l.d(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ug.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.d0 a(ah.h r38) {
        /*
            Method dump skipped, instruction units count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.h.a(ah.h):ug.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b7.b1 b(ug.d0 r12, b5.d0 r13) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.h.b(ug.d0, b5.d0):b7.b1");
    }

    public boolean d(IOException iOException, zg.n nVar, b1 b1Var) {
        boolean z10 = iOException instanceof ch.a;
        if (!((x) this.f229b).f21911e) {
            return false;
        }
        if ((!z10 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z10) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        b5.d0 d0Var = nVar.f26884q;
        if (d0Var == null || !d0Var.f1520a) {
            return false;
        }
        zg.h hVar = nVar.f26874g;
        jc.l.b(hVar);
        zg.p pVarF = hVar.f();
        b5.d0 d0Var2 = nVar.f26884q;
        return pVarF.a(d0Var2 != null ? d0Var2.l() : null);
    }

    public h(ug.b bVar) {
        this.f228a = 2;
        jc.l.e(bVar, "cookieJar");
        this.f229b = bVar;
    }
}
