.class public final Ly/y0;
.super Lj1/p;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Li2/s1;


# instance fields
.field public o:F

.field public p:Z


# virtual methods
.method public final l0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

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
    iget v0, p0, Ly/y0;->o:F

    .line 17
    .line 18
    iput v0, p1, Ly/h1;->a:F

    .line 19
    .line 20
    iget-boolean v0, p0, Ly/y0;->p:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Ly/h1;->b:Z

    .line 23
    .line 24
    return-object p1
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
