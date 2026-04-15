.class public final Lmd/f;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# static fields
.field public static final a:Lmd/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lmd/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmd/f;->a:Lmd/f;

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lmd/g;->g:[Lpc/u;

    .line 2
    .line 3
    sget-object v0, Lmd/c;->a:Lbe/e;

    .line 4
    .line 5
    new-instance v1, Lge/w;

    .line 6
    .line 7
    const-string v2, "Deprecated in Java"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Lge/g;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lub/k;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lvb/w;->u(Lub/k;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
