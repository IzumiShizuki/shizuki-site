.class public final Ls4/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lp4/b;


# static fields
.field public static final c:Lxa/i;


# instance fields
.field public final a:Lcb/z;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp5/m;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lp5/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lua/l;->U(Lxa/i;)Lxa/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ls4/i;->c:Lxa/i;

    .line 12
    .line 13
    return-void
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

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget-object v0, Ls4/i;->c:Lxa/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lxa/i;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcb/z;

    .line 8
    .line 9
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lm0/w;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lm0/w;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ls4/i;->a:Lcb/z;

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, Ls4/i;->b:I

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
.method public final B0([B)Lcb/y;
    .locals 1

    .line 1
    new-instance v0, Lk9/a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lk9/a;-><init>(Ls4/i;[B)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls4/i;->a:Lcb/z;

    .line 7
    .line 8
    check-cast p1, Lcb/a0;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcb/a0;->b(Ljava/util/concurrent/Callable;)Lcb/y;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
