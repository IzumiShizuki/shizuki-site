.class public abstract Lya/y;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lya/w;

.field public static final b:Lya/x;

.field public static final c:Lya/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lya/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lya/y;->a:Lya/w;

    .line 7
    .line 8
    new-instance v0, Lya/x;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Lya/x;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lya/y;->b:Lya/x;

    .line 15
    .line 16
    new-instance v0, Lya/x;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lya/x;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lya/y;->c:Lya/x;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public abstract a(II)Lya/y;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lya/y;
.end method

.method public abstract c(ZZ)Lya/y;
.end method

.method public abstract d(ZZ)Lya/y;
.end method

.method public abstract e()I
.end method
