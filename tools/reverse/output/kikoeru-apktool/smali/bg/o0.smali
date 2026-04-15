.class public abstract Lbg/o0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation runtime Lsf/g;
.end annotation


# static fields
.field public static final Companion:Lbg/w;

.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbg/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbg/o0;->Companion:Lbg/w;

    .line 7
    .line 8
    sget-object v0, Lub/i;->a:Lub/i;

    .line 9
    .line 10
    sget-object v1, Lbg/v;->c:Lbg/v;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lbg/o0;->a:Ljava/lang/Object;

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


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method
