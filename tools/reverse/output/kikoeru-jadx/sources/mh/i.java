package mh;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends lh.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Socket f15187n;

    public i(Socket socket) {
        this.f15187n = socket;
    }

    @Override // lh.c
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // lh.c
    public final void k() {
        Socket socket = this.f15187n;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!m.a(e10)) {
                throw e10;
            }
            m.f15219a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        } catch (Exception e11) {
            m.f15219a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
