.class public final Lpd/p;
.super Lbd/j0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final synthetic m:[Lpc/u;


# instance fields
.field public final g:Led/y;

.field public final h:Lb0/w1;

.field public final i:Lre/i;

.field public final j:Lpd/d;

.field public final k:Lre/c;

.field public final l:Lzc/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Ljc/s;

    .line 2
    .line 3
    const-class v1, Lpd/p;

    .line 4
    .line 5
    const-string v2, "binaryClasses"

    .line 6
    .line 7
    const-string v3, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Ljc/s;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljc/z;->a:Ljc/a0;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljc/a0;->g(Ljc/s;)Lpc/t;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v3, "partToFacade"

    .line 20
    .line 21
    const-string v5, "getPartToFacade()Ljava/util/HashMap;"

    .line 22
    .line 23
    invoke-static {v1, v3, v5, v4, v2}, Lq/t0;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjc/a0;)Lpc/t;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [Lpc/u;

    .line 29
    .line 30
    aput-object v0, v2, v4

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    aput-object v1, v2, v0

    .line 34
    .line 35
    sput-object v2, Lpd/p;->m:[Lpc/u;

    .line 36
    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public constructor <init>(Lb0/w1;Led/y;)V
    .locals 5

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lb0/w1;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lod/a;

    .line 9
    .line 10
    iget-object v1, v0, Lod/a;->o:Lyc/y;

    .line 11
    .line 12
    iget-object v2, p2, Led/y;->a:Lbe/c;

    .line 13
    .line 14
    invoke-direct {p0, v1, v2}, Lbd/j0;-><init>(Lyc/y;Lbe/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lpd/p;->g:Led/y;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x6

    .line 21
    invoke-static {p1, p0, v1, v2}, Ln7/d;->f(Lb0/w1;Lyc/g;Led/o;I)Lb0/w1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lpd/p;->h:Lb0/w1;

    .line 26
    .line 27
    iget-object v0, v0, Lod/a;->d:Lud/g;

    .line 28
    .line 29
    invoke-virtual {v0}, Lud/g;->c()Loe/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, Loe/i;->c:Loe/j;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v0, Lyd/e;->g:Lyd/e;

    .line 39
    .line 40
    iget-object v0, p1, Lb0/w1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lod/a;

    .line 43
    .line 44
    iget-object v1, v0, Lod/a;->a:Lre/o;

    .line 45
    .line 46
    new-instance v2, Lpd/o;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v2, p0, v3}, Lpd/o;-><init>(Lpd/p;I)V

    .line 50
    .line 51
    .line 52
    move-object v3, v1

    .line 53
    check-cast v3, Lre/l;

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v4, Lre/i;

    .line 59
    .line 60
    invoke-direct {v4, v3, v2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 61
    .line 62
    .line 63
    iput-object v4, p0, Lpd/p;->i:Lre/i;

    .line 64
    .line 65
    new-instance v2, Lpd/d;

    .line 66
    .line 67
    invoke-direct {v2, p1, p2, p0}, Lpd/d;-><init>(Lb0/w1;Led/y;Lpd/p;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lpd/p;->j:Lpd/d;

    .line 71
    .line 72
    new-instance v2, Lpd/o;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-direct {v2, p0, v3}, Lpd/o;-><init>(Lpd/p;I)V

    .line 76
    .line 77
    .line 78
    move-object v3, v1

    .line 79
    check-cast v3, Lre/l;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v4, Lre/c;

    .line 85
    .line 86
    invoke-direct {v4, v3, v2}, Lre/h;-><init>(Lre/l;Lic/a;)V

    .line 87
    .line 88
    .line 89
    iput-object v4, p0, Lpd/p;->k:Lre/c;

    .line 90
    .line 91
    iget-object v0, v0, Lod/a;->v:Lb7/n;

    .line 92
    .line 93
    iget-boolean v0, v0, Lb7/n;->b:Z

    .line 94
    .line 95
    if-eqz v0, :cond_0

    .line 96
    .line 97
    sget-object p1, Lzc/g;->a:Lzc/f;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-static {p1, p2}, Ln7/e;->z(Lb0/w1;Lsd/b;)Lod/c;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    iput-object p1, p0, Lpd/p;->l:Lzc/h;

    .line 105
    .line 106
    new-instance p1, Lpd/o;

    .line 107
    .line 108
    const/4 p2, 0x2

    .line 109
    invoke-direct {p1, p0, p2}, Lpd/o;-><init>(Lpd/p;I)V

    .line 110
    .line 111
    .line 112
    check-cast v1, Lre/l;

    .line 113
    .line 114
    invoke-virtual {v1, p1}, Lre/l;->a(Lic/a;)Lre/i;

    .line 115
    .line 116
    .line 117
    return-void
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public final getAnnotations()Lzc/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/p;->l:Lzc/h;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final m()Lyc/m0;
    .locals 2

    .line 1
    new-instance v0, Lr/y1;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lr/y1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final n0()Lle/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lpd/p;->j:Lpd/d;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java package fragment: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbd/j0;->e:Lbe/c;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " of module "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lpd/p;->h:Lb0/w1;

    .line 19
    .line 20
    iget-object v1, v1, Lb0/w1;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lod/a;

    .line 23
    .line 24
    iget-object v1, v1, Lod/a;->o:Lyc/y;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
