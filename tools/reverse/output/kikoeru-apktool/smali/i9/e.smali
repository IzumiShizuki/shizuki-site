.class public final Li9/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ls4/g;


# instance fields
.field public final a:Lub/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le/e;

    .line 5
    .line 6
    const/16 v1, 0x1b

    .line 7
    .line 8
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Li9/e;->a:Lub/p;

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


# virtual methods
.method public final q()Ls4/h;
    .locals 5

    .line 1
    new-instance v0, Li9/d;

    .line 2
    .line 3
    iget-object v1, p0, Li9/e;->a:Lub/p;

    .line 4
    .line 5
    invoke-virtual {v1}, Lub/p;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls4/o;

    .line 10
    .line 11
    new-instance v2, Ls4/r;

    .line 12
    .line 13
    iget v3, v1, Ls4/o;->b:I

    .line 14
    .line 15
    iget v4, v1, Ls4/o;->c:I

    .line 16
    .line 17
    iget-object v1, v1, Ls4/o;->a:Lm0/w;

    .line 18
    .line 19
    invoke-direct {v2, v3, v4, v1}, Ls4/r;-><init>(IILm0/w;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v2}, Li9/d;-><init>(Ls4/r;)V

    .line 23
    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
.end method
