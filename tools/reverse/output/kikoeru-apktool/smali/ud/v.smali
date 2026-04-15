.class public final Lud/v;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final i:Lud/v;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lud/v;

.field public final d:Z

.field public final e:Lud/v;

.field public final f:Lud/v;

.field public final g:Z

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lud/v;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x7ff

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lud/v;-><init>(Lud/v;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lud/v;

    .line 10
    .line 11
    const/16 v2, 0x7dc

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, Lud/v;-><init>(Lud/v;I)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lud/v;->i:Lud/v;

    .line 17
    .line 18
    return-void
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

.method public synthetic constructor <init>(Lud/v;I)V
    .locals 12

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    and-int/lit8 v0, p2, 0x20

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    :cond_2
    move-object v6, p1

    and-int/lit16 p1, p2, 0x200

    if-eqz p1, :cond_3

    const/4 v10, 0x0

    goto :goto_2

    :cond_3
    const/4 v10, 0x1

    :goto_2
    and-int/lit16 p1, p2, 0x400

    if-eqz p1, :cond_4

    const/4 v11, 0x0

    goto :goto_3

    :cond_4
    const/4 v11, 0x1

    :goto_3
    const/4 v7, 0x1

    move-object v8, v6

    move-object v9, v6

    move-object v3, p0

    .line 10
    invoke-direct/range {v3 .. v11}, Lud/v;-><init>(ZZLud/v;ZLud/v;Lud/v;ZZ)V

    return-void
.end method

.method public constructor <init>(ZZLud/v;ZLud/v;Lud/v;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lud/v;->a:Z

    .line 3
    iput-boolean p2, p0, Lud/v;->b:Z

    .line 4
    iput-object p3, p0, Lud/v;->c:Lud/v;

    .line 5
    iput-boolean p4, p0, Lud/v;->d:Z

    .line 6
    iput-object p5, p0, Lud/v;->e:Lud/v;

    .line 7
    iput-object p6, p0, Lud/v;->f:Lud/v;

    .line 8
    iput-boolean p7, p0, Lud/v;->g:Z

    .line 9
    iput-boolean p8, p0, Lud/v;->h:Z

    return-void
.end method
