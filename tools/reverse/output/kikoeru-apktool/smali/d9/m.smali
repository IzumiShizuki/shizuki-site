.class public final Ld9/m;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ln7/v;

.field public final b:Ld9/c;

.field public final c:Ld9/d;


# direct methods
.method public constructor <init>(Ln7/v;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld9/m;->a:Ln7/v;

    .line 5
    .line 6
    new-instance p1, Ld9/c;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0}, Ld9/c;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ld9/m;->b:Ld9/c;

    .line 13
    .line 14
    new-instance p1, Ld9/d;

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    invoke-direct {p1, v0}, Ld9/d;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ld9/m;->c:Ld9/d;

    .line 21
    .line 22
    return-void
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


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ld9/i;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ld9/i;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ld9/m;->a:Ln7/v;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v1, v2, v3, v0}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    return-object v0
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

.method public final b(Lc9/c;)V
    .locals 3

    .line 1
    new-instance v0, Ld9/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ld9/k;-><init>(Ld9/m;Lc9/c;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ld9/m;->a:Ln7/v;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {p1, v1, v2, v0}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
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
