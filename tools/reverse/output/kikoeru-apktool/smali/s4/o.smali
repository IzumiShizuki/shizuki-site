.class public final Ls4/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/g;


# instance fields
.field public final a:Lm0/w;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm0/w;

    .line 5
    .line 6
    const/16 v1, 0x11

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lm0/w;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ls4/o;->a:Lm0/w;

    .line 12
    .line 13
    const/16 v0, 0x1f40

    .line 14
    .line 15
    iput v0, p0, Ls4/o;->b:I

    .line 16
    .line 17
    iput v0, p0, Ls4/o;->c:I

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public final q()Ls4/h;
    .locals 4

    .line 1
    new-instance v0, Ls4/r;

    .line 2
    .line 3
    iget v1, p0, Ls4/o;->c:I

    .line 4
    .line 5
    iget-object v2, p0, Ls4/o;->a:Lm0/w;

    .line 6
    .line 7
    iget v3, p0, Ls4/o;->b:I

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Ls4/r;-><init>(IILm0/w;)V

    .line 10
    .line 11
    .line 12
    return-object v0
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
