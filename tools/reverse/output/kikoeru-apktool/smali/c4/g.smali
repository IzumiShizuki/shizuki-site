.class public abstract Lc4/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc4/g;->a:I

    .line 3
    iput-object p2, p0, Lc4/g;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lc4/g;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc4/j;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lc4/g;->a:I

    .line 7
    new-instance v0, Lc4/d;

    invoke-direct {v0}, Lc4/d;-><init>()V

    iput-object v0, p0, Lc4/g;->c:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lc4/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract a(Lz7/a;)V
.end method

.method public abstract b(Lz7/a;)V
.end method

.method public abstract c(Lz7/a;)V
.end method

.method public abstract d(Lz7/a;)V
.end method

.method public abstract e(Lz7/a;)V
.end method

.method public abstract f(Lz7/a;)V
.end method

.method public abstract g(Lz7/a;)Lk5/d;
.end method
