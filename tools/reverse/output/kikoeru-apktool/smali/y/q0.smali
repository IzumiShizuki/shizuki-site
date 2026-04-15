.class public final Ly/q0;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/s1;


# instance fields
.field public o:Lj1/f;


# virtual methods
.method public final l0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    instance-of v0, p1, Ly/h1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ly/h1;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Ly/h1;

    .line 12
    .line 13
    invoke-direct {p1}, Ly/h1;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Ly/q0;->o:Lj1/f;

    .line 17
    .line 18
    new-instance v1, Ly/y;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ly/y;-><init>(Lj1/f;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p1, Ly/h1;->c:Ly/d;

    .line 24
    .line 25
    return-object p1
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
