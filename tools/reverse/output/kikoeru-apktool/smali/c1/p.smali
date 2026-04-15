.class public final Lc1/p;
.super Lc1/n;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final d:Lbf/h;


# direct methods
.method public constructor <init>(Lbf/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc1/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc1/p;->d:Lbf/h;

    .line 5
    .line 6
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lc1/n;->c:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iput v1, p0, Lc1/n;->c:I

    .line 6
    .line 7
    new-instance v1, Lc1/b;

    .line 8
    .line 9
    iget-object v2, p0, Lc1/n;->a:[Ljava/lang/Object;

    .line 10
    .line 11
    aget-object v3, v2, v0

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    aget-object v0, v2, v0

    .line 16
    .line 17
    iget-object v2, p0, Lc1/p;->d:Lbf/h;

    .line 18
    .line 19
    invoke-direct {v1, v2, v3, v0}, Lc1/b;-><init>(Lbf/h;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
