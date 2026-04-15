.class public final Lh0/w;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:Lf1/f;

.field public final synthetic c:Lh0/u0;

.field public final synthetic d:Lt2/l0;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:Lh0/p1;

.field public final synthetic h:Ly2/y;

.field public final synthetic i:Ly2/g0;

.field public final synthetic j:Lj1/q;

.field public final synthetic k:Lj1/q;

.field public final synthetic l:Lj1/q;

.field public final synthetic m:Lj1/q;

.field public final synthetic n:Le0/b;

.field public final synthetic o:Ll0/l1;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Lic/k;

.field public final synthetic s:Ly2/r;

.field public final synthetic t:Lf3/c;


# direct methods
.method public constructor <init>(Lf1/f;Lh0/u0;Lt2/l0;IILh0/p1;Ly2/y;Ly2/g0;Lj1/q;Lj1/q;Lj1/q;Lj1/q;Le0/b;Ll0/l1;ZZLic/k;Ly2/r;Lf3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh0/w;->b:Lf1/f;

    .line 2
    .line 3
    iput-object p2, p0, Lh0/w;->c:Lh0/u0;

    .line 4
    .line 5
    iput-object p3, p0, Lh0/w;->d:Lt2/l0;

    .line 6
    .line 7
    iput p4, p0, Lh0/w;->e:I

    .line 8
    .line 9
    iput p5, p0, Lh0/w;->f:I

    .line 10
    .line 11
    iput-object p6, p0, Lh0/w;->g:Lh0/p1;

    .line 12
    .line 13
    iput-object p7, p0, Lh0/w;->h:Ly2/y;

    .line 14
    .line 15
    iput-object p8, p0, Lh0/w;->i:Ly2/g0;

    .line 16
    .line 17
    iput-object p9, p0, Lh0/w;->j:Lj1/q;

    .line 18
    .line 19
    iput-object p10, p0, Lh0/w;->k:Lj1/q;

    .line 20
    .line 21
    iput-object p11, p0, Lh0/w;->l:Lj1/q;

    .line 22
    .line 23
    iput-object p12, p0, Lh0/w;->m:Lj1/q;

    .line 24
    .line 25
    iput-object p13, p0, Lh0/w;->n:Le0/b;

    .line 26
    .line 27
    iput-object p14, p0, Lh0/w;->o:Ll0/l1;

    .line 28
    .line 29
    iput-boolean p15, p0, Lh0/w;->p:Z

    .line 30
    .line 31
    move/from16 p1, p16

    .line 32
    .line 33
    iput-boolean p1, p0, Lh0/w;->q:Z

    .line 34
    .line 35
    move-object/from16 p1, p17

    .line 36
    .line 37
    iput-object p1, p0, Lh0/w;->r:Lic/k;

    .line 38
    .line 39
    move-object/from16 p1, p18

    .line 40
    .line 41
    iput-object p1, p0, Lh0/w;->s:Ly2/r;

    .line 42
    .line 43
    move-object/from16 p1, p19

    .line 44
    .line 45
    iput-object p1, p0, Lh0/w;->t:Lf3/c;

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 49
    .line 50
    .line 51
    return-void
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
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lx0/o;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x1

    .line 19
    if-eq v3, v4, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x0

    .line 24
    :goto_0
    and-int/2addr v2, v5

    .line 25
    invoke-virtual {v1, v2, v3}, Lx0/o;->N(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    new-instance v3, Lh0/v;

    .line 32
    .line 33
    iget-object v2, v0, Lh0/w;->s:Ly2/r;

    .line 34
    .line 35
    iget-object v4, v0, Lh0/w;->t:Lf3/c;

    .line 36
    .line 37
    move-object/from16 v21, v4

    .line 38
    .line 39
    iget-object v4, v0, Lh0/w;->c:Lh0/u0;

    .line 40
    .line 41
    iget-object v5, v0, Lh0/w;->d:Lt2/l0;

    .line 42
    .line 43
    iget v6, v0, Lh0/w;->e:I

    .line 44
    .line 45
    iget v7, v0, Lh0/w;->f:I

    .line 46
    .line 47
    iget-object v8, v0, Lh0/w;->g:Lh0/p1;

    .line 48
    .line 49
    iget-object v9, v0, Lh0/w;->h:Ly2/y;

    .line 50
    .line 51
    iget-object v10, v0, Lh0/w;->i:Ly2/g0;

    .line 52
    .line 53
    iget-object v11, v0, Lh0/w;->j:Lj1/q;

    .line 54
    .line 55
    iget-object v12, v0, Lh0/w;->k:Lj1/q;

    .line 56
    .line 57
    iget-object v13, v0, Lh0/w;->l:Lj1/q;

    .line 58
    .line 59
    iget-object v14, v0, Lh0/w;->m:Lj1/q;

    .line 60
    .line 61
    iget-object v15, v0, Lh0/w;->n:Le0/b;

    .line 62
    .line 63
    move-object/from16 v20, v2

    .line 64
    .line 65
    iget-object v2, v0, Lh0/w;->o:Ll0/l1;

    .line 66
    .line 67
    move-object/from16 v16, v2

    .line 68
    .line 69
    iget-boolean v2, v0, Lh0/w;->p:Z

    .line 70
    .line 71
    move/from16 v17, v2

    .line 72
    .line 73
    iget-boolean v2, v0, Lh0/w;->q:Z

    .line 74
    .line 75
    move/from16 v18, v2

    .line 76
    .line 77
    iget-object v2, v0, Lh0/w;->r:Lic/k;

    .line 78
    .line 79
    move-object/from16 v19, v2

    .line 80
    .line 81
    invoke-direct/range {v3 .. v21}, Lh0/v;-><init>(Lh0/u0;Lt2/l0;IILh0/p1;Ly2/y;Ly2/g0;Lj1/q;Lj1/q;Lj1/q;Lj1/q;Le0/b;Ll0/l1;ZZLic/k;Ly2/r;Lf3/c;)V

    .line 82
    .line 83
    .line 84
    const v2, -0x6d69c381

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v3, v1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v3, 0x6

    .line 92
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    iget-object v4, v0, Lh0/w;->b:Lf1/f;

    .line 97
    .line 98
    invoke-virtual {v4, v2, v1, v3}, Lf1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v1}, Lx0/o;->Q()V

    .line 103
    .line 104
    .line 105
    :goto_1
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 106
    .line 107
    return-object v1
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
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
