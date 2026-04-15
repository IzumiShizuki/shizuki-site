.class public abstract Ltd/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lzc/i;

.field public static final b:Lzc/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzc/i;

    .line 2
    .line 3
    sget-object v1, Lld/w;->p:Lbe/c;

    .line 4
    .line 5
    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lzc/i;-><init>(Lbe/c;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ltd/t;->a:Lzc/i;

    .line 14
    .line 15
    new-instance v0, Lzc/i;

    .line 16
    .line 17
    sget-object v1, Lld/w;->q:Lbe/c;

    .line 18
    .line 19
    const-string v2, "ENHANCED_MUTABILITY_ANNOTATION"

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lzc/i;-><init>(Lbe/c;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ltd/t;->b:Lzc/i;

    .line 28
    .line 29
    return-void
.end method
