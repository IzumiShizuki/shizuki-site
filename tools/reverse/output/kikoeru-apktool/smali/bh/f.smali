.class public final Lbh/f;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llh/f0;


# instance fields
.field public final a:Llh/p;

.field public b:Z

.field public final synthetic c:Lbh/h;


# direct methods
.method public constructor <init>(Lbh/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbh/f;->c:Lbh/h;

    .line 5
    .line 6
    new-instance v0, Llh/p;

    .line 7
    .line 8
    iget-object p1, p1, Lbh/h;->c:Ltc/b0;

    .line 9
    .line 10
    iget-object p1, p1, Ltc/b0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Llh/a0;

    .line 13
    .line 14
    iget-object p1, p1, Llh/a0;->a:Llh/f0;

    .line 15
    .line 16
    invoke-interface {p1}, Llh/f0;->a()Llh/j0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Llh/p;-><init>(Llh/j0;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbh/f;->a:Llh/p;

    .line 24
    .line 25
    return-void
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


# virtual methods
.method public final H(Llh/f;J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lbh/f;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p1, Llh/f;->b:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p2

    .line 10
    invoke-static/range {v1 .. v6}, Lwg/e;->a(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lbh/f;->c:Lbh/h;

    .line 14
    .line 15
    iget-object p2, p2, Lbh/h;->c:Ltc/b0;

    .line 16
    .line 17
    iget-object p2, p2, Ltc/b0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Llh/a0;

    .line 20
    .line 21
    invoke-virtual {p2, p1, v5, v6}, Llh/a0;->H(Llh/f;J)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string p2, "closed"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final a()Llh/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lbh/f;->a:Llh/p;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lbh/f;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lbh/f;->b:Z

    .line 8
    .line 9
    iget-object v0, p0, Lbh/f;->a:Llh/p;

    .line 10
    .line 11
    iget-object v1, v0, Llh/p;->e:Llh/j0;

    .line 12
    .line 13
    sget-object v2, Llh/j0;->d:Llh/i0;

    .line 14
    .line 15
    iput-object v2, v0, Llh/p;->e:Llh/j0;

    .line 16
    .line 17
    invoke-virtual {v1}, Llh/j0;->a()Llh/j0;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Llh/j0;->b()Llh/j0;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object v1, p0, Lbh/f;->c:Lbh/h;

    .line 25
    .line 26
    iput v0, v1, Lbh/h;->d:I

    .line 27
    .line 28
    return-void
    .line 29
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbh/f;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lbh/f;->c:Lbh/h;

    .line 7
    .line 8
    iget-object v0, v0, Lbh/h;->c:Ltc/b0;

    .line 9
    .line 10
    iget-object v0, v0, Ltc/b0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Llh/a0;

    .line 13
    .line 14
    invoke-virtual {v0}, Llh/a0;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
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
