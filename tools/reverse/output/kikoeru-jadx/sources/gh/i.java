package gh;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l {
    @Override // gh.l
    public final boolean a(SSLSocket sSLSocket) {
        return k.f7564b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // gh.l
    public final n h(SSLSocket sSLSocket) {
        return new k();
    }
}
