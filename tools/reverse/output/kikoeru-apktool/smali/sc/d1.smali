.class public Lsc/d1;
.super Lsc/q1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lpc/r;


# instance fields
.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lsc/q1;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    new-instance p1, Lsc/b1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lsc/b1;-><init>(Lsc/d1;I)V

    sget-object p2, Lub/i;->a:Lub/i;

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    move-result-object p1

    iput-object p1, p0, Lsc/d1;->l:Ljava/lang/Object;

    .line 6
    new-instance p1, Lsc/b1;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Lsc/b1;-><init>(Lsc/d1;I)V

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    return-void
.end method

.method public constructor <init>(Lsc/i0;Lyc/k0;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2}, Lsc/q1;-><init>(Lsc/i0;Lyc/k0;)V

    .line 2
    new-instance p1, Lsc/b1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lsc/b1;-><init>(Lsc/d1;I)V

    sget-object p2, Lub/i;->a:Lub/i;

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    move-result-object p1

    iput-object p1, p0, Lsc/d1;->l:Ljava/lang/Object;

    .line 3
    new-instance p1, Lsc/b1;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lsc/b1;-><init>(Lsc/d1;I)V

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsc/d1;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final d()Lpc/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/d1;->l:Ljava/lang/Object;

    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc/c1;

    return-object v0
.end method

.method public final d()Lpc/q;
    .locals 1

    .line 2
    iget-object v0, p0, Lsc/d1;->l:Ljava/lang/Object;

    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc/c1;

    return-object v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lsc/d1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/c1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v1, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lsc/u;->h([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
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

.method public final w()Lsc/n1;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/d1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lsc/c1;

    .line 8
    .line 9
    return-object v0
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
