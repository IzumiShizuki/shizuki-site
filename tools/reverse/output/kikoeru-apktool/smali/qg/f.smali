.class public final Lqg/f;
.super Lqg/h;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:Lqg/g;


# virtual methods
.method public final b(Lrg/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqg/f;->a:Lqg/g;

    .line 2
    .line 3
    iget-wide v1, p1, Lrg/e;->H:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lqg/g;->seek(J)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqg/f;->a:Lqg/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lqg/g;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final read()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqg/f;->a:Lqg/g;

    invoke-virtual {v0}, Lqg/g;->read()I

    move-result v0

    return v0
.end method

.method public final read([B)I
    .locals 3

    .line 2
    array-length v0, p1

    .line 3
    iget-object v1, p0, Lqg/f;->a:Lqg/g;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, v0}, Lqg/g;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 1

    .line 4
    iget-object v0, p0, Lqg/f;->a:Lqg/g;

    invoke-virtual {v0, p1, p2, p3}, Lqg/g;->read([BII)I

    move-result p1

    return p1
.end method
