.class public final Lsc/o0;
.super Lsc/g1;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lpc/k;


# instance fields
.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lsc/g1;-><init>(Lsc/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    new-instance p1, Lbd/e;

    const/16 p2, 0x13

    invoke-direct {p1, p2, p0}, Lbd/e;-><init>(ILjava/lang/Object;)V

    sget-object p2, Lub/i;->a:Lub/i;

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    move-result-object p1

    iput-object p1, p0, Lsc/o0;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsc/i0;Lyc/k0;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lsc/g1;-><init>(Lsc/i0;Lyc/k0;)V

    .line 4
    new-instance p1, Lbd/e;

    const/16 p2, 0x13

    invoke-direct {p1, p2, p0}, Lbd/e;-><init>(ILjava/lang/Object;)V

    sget-object p2, Lub/i;->a:Lub/i;

    invoke-static {p2, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    move-result-object p1

    iput-object p1, p0, Lsc/o0;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Lpc/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc/o0;->m:Ljava/lang/Object;

    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc/n0;

    return-object v0
.end method

.method public final e()Lpc/j;
    .locals 1

    .line 2
    iget-object v0, p0, Lsc/o0;->m:Ljava/lang/Object;

    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc/n0;

    return-object v0
.end method
